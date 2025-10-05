;; MACRO PROBLEM 4: Threading macro variations
;; Create your own version of the thread-first macro (->)
;; This is one of Clojure's most beloved macros!
;;
;; The thread-first macro takes a value and threads it through a series of expressions
;; as the first argument to each function.
;;
;; Your macro should transform:
;;   (thread-first 5 (+ 10) (* 2) (- 3))
;; Into:
;;   (- (* (+ 5 10) 2) 3)
;;
;; Step by step: 5 → (+ 5 10) → (* 15 2) → (- 30 3) → 27
;;
;; Challenge: Use recursion or reduce to build the nested structure
;; Hint: You need to insert the threaded value as the first argument of each form

(defmacro thread-first [initial-value & forms])

;; Test your macro:
;; (thread-first 10 (+ 5) (* 2) (/ 3))  ; Should give (/ (* (+ 10 5) 2) 3) = 10