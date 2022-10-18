(ns mentat.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [mentat.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[mentat started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[mentat has shut down successfully]=-"))
   :middleware wrap-dev})
