(ns duct-beginner-practice.domain.message.sender)

(defprotocol Sender
  (send! [this message]))