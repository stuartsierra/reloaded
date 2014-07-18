(ns user
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application."
  (:require
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir doc find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.test :as test]
   [clojure.tools.namespace.repl :refer [refresh refresh-all]]
   [{{main-ns}}]))

(def system
  "A Var containing an object representing the application under
  development."
  nil)

(def system-state
  "A Var containing a keyword representing the state of the
  application under development (:stopped or :started)."
  :stopped)

(defn init
  "Creates and initializes the system under development in the Var
  #'system."
  []
  {:pre [(= system-state :stopped)]}
  ;; TODO
  )

(defn start
  "Starts the system running, updates the Var #'system."
  []
  {:pre [(= system-state :stopped)]}
  ;; TODO
  (alter-var-root #'system-state (constantly :started)))

(defn stop
  "Stops the system if it is currently running, updates the Var
  #'system."
  []
  {:pre [(= system-state :started)]}
  ;; TODO
  (alter-var-root #'system-state (constantly :stopped)))

(defn go
  "Initializes and starts the system running."
  []
  (init)
  (start)
  :ready)

(defn reset
  "Stops the system, reloads modified source files, and restarts it."
  []
  (stop)
  (refresh :after 'user/go))
