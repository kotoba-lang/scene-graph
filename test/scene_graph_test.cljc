(ns scene_graph-test
  (:require [clojure.test :refer [deftest is testing]]
            [scene_graph]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? scene_graph))))
