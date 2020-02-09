(ns reagent-test-proj.prod
  (:require [reagent-test-proj.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
