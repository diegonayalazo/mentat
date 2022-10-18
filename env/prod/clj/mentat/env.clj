(ns mentat.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[mentat started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[mentat has shut down successfully]=-"))
   :middleware identity})
