(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.

  The system under development is :refer'd from
  `com.stuartsierra.component.repl/system`.
  Call `(reset)` to reload modified code and (re)start the system.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir doc find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as string]
   [clojure.test :as test]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [com.stuartsierra.component :as component]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [{{main-ns}}]))

(defn dev-system
  "Constructs a system map suitable for interactive development."
  []
  (component/system-map
   ;; TODO
   ))

(set-init (fn [_] (dev-system)))
