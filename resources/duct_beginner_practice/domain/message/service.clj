(ns duct-beginner-practice.domain.message.service)

(defprotocol MessageService
  (send! [this message]))