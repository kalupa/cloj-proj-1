(ns proj1.core)

;; (1 2 3 4)
;; [1 2 3 4]
;; ('hello :hello "hello" 123 4.5 [123] {:hello "World"} #{1 2 3 4} 123e10)

(defn unbounce
  "I am a banana"

  ([]
   (println "Unbounce, no arguments!"))

  ([x]
   (println "Unbounce, yay!" x))

  ([a & more]
   (println "Unbounce more things" more))
  )
