(ns user
  "Utility functions to rapidly bootstrap the REPL for interactive
  development. This file is automatically loaded by Clojure on
  startup, so you can run `(dev)` or `(go)` immedately after the REPL
  starts.")

(defn dev
  "Loads and switches to the 'dev' namespace."
  []
  (require 'dev)
  (in-ns 'dev))

(defn go
  "Loads all source files, starts the application running in
  development mode, and switches to the 'dev' namespace."
  []
  (in-ns 'dev)
  (require 'com.stuartsierra.component.repl)
  ((resolve 'com.stuartsierra.component.repl/reset)))
