(ns duct-beginner-practice.handler.api
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defmethod ig/init-key :duct-beginner-practice.handler/api [_ options]
  ;context is a macro
  ; It has to return a Ring response
  ;See https://github.com/weavejester/compojure/wiki/Nesting-routes
  (context "/messages" []
    (GET "/" []
      {:body {:example "data"}})))
