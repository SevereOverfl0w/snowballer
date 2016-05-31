(defproject snowballer "0.2.0+alpha"
  :description "A bukkure plugin to throw snowballs with sticks"
  :repositories [["spigot-repo" "https://hub.spigotmc.org/nexus/content/groups/public/"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [bukkure "0.4.3"]]
  :java-source-paths ["javasrc"]
  :profiles {:provided
             {:dependencies [[org.bukkit/bukkit "1.8.8-R0.1-SNAPSHOT"]]}})
