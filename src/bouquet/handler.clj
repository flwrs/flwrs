(ns bouquet.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(def irc (connect freenode))
(login irc user)
(write irc "JOIN #clojure")
(write irc "QUIT")
