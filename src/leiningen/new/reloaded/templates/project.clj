(defproject {{full-name}} "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [com.stuartsierra/component "1.1.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "1.2.0"]
                                  [com.stuartsierra/component.repl "1.0.0"]]
                   :source-paths ["dev"]}})
