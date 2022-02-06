(ns duct-beginner-practice.handler.example
  (:require [compojure.core :refer :all]
            [integrant.core :as ig]))

(defmethod ig/init-key :duct-beginner-practice.handler/example [_ options]
  ;context is a macro
  ; It has to returns a Ring response
  ;See https://github.com/weavejester/compojure/wiki/Nesting-routes
  (context "/example" []
    (GET "/" []
      {:body {:example "data"}})))
