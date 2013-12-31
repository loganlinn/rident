(ns rident.uuid
  (:require [rident.core :as core]))

(def generator
  ;; TODO Make CLJS friendly
  (reify core/Generator
    (generate [_] (str (java.util.UUID/randomUUID)))))

(defn generate [] (core/generate generator))
