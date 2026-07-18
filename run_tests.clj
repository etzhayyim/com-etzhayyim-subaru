(require '[clojure.test :as t])
(def test-namespaces '[subaru.murakumo-test subaru.tests.test-subaru subaru.tests.test-kotoba])
(doseq [ns-sym test-namespaces] (require ns-sym))
(let [result (apply t/run-tests test-namespaces)]
  (when-not (zero? (+ (:fail result) (:error result))) (System/exit 1)))
