(ns snowballer.core
  (:require [bukkure.logging :as log]
            [bukkure.config :as cfg]
            [bukkure.events :as ev]))

(defonce plugin (atom nil))

(defn sign-change [ev]
  {:msg (format (cfg/get-string @plugin "snowballer.placesign") (first (.getLines ev)))})

(defn fireprojectile [ev]
  (let [player (.getPlayer ev)
        in-hand (.. player getInventory getItemInHand getType)
        action (.getAction ev)]
    (when (and (= in-hand org.bukkit.Material/STICK)
               (= action org.bukkit.event.block.Action/RIGHT_CLICK_AIR))
      (.launchProjectile player org.bukkit.entity.Snowball))))

(defn events []
  [(ev/event "block.sign-change" #'sign-change)
   (ev/event "player.player-interact" #'fireprojectile)])

(defn on-enable [plugin-instance]
  (log/info "Starting snowballer")
  (reset! plugin plugin-instance)
  (ev/register-eventlist @plugin (events)))

(defn on-disable [plugin]
  (log/info "Stopping your new bukkure plugin!"))
