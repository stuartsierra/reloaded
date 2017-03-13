(ns user
  "Utility functions to rapidly bootstrap the REPL for interactive
  development. This file is automatically loaded by Clojure on
  startup.

  Run `(go)` to load all source code, start the component system
  running, and switch to the `dev` namespace. `(reset)` is an alias
  for `(go)`.

  Or run `(dev)` to just load code and switch to `dev` without
  starting the system."
  (:require
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))
