(ns duct-beginner-practice.domain.message.impl
  (:require [duct-beginner-practice.domain.message.service :refer [MessageService]]))

(defrecord MessageServiceImpl []
  MessageService
  (send! [_ message]))