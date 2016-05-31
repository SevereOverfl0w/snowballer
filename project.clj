(defproject snowballer "0.3+alpha"
  :description "A bukkure plugin to throw snowballs with sticks"
  :repositories [["spigot-repo" "https://hub.spigotmc.org/nexus/content/groups/public/"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [bukkure "1.6+alpha"]]
  :java-source-paths ["javasrc"]
  :profiles {:provided
             {:dependencies [[org.bukkit/bukkit "1.9.4-R0.1-SNAPSHOT"]]}})
