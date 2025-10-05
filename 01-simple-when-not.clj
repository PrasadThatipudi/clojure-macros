;; MACRO PROBLEM 1: Create a simple 'when-not' macro
;; Macros are functions that take code as input and return transformed code as output.
;; The 'when-not' macro should execute code only when a condition is false.
;;
;; Your macro should transform:
;;   (when-not false (println "Hello"))  →  (when (not false) (println "Hello"))
;;   (when-not true (println "Hello"))   →  (when (not true) (println "Hello"))
;;
;; Syntax: (defmacro name [parameters] body)
;; Use: `(syntax-quote), ~(unquote), ~@(unquote-splicing)
;;
;; Example usage:
;;   (when-not false (println "This will print"))
;;   (when-not true (println "This won't print"))

(defmacro my-when-not [condition & body]
  `(when (not ~condition) ~@body))

(my-when-not false (print "This is false"))
;; Test your macro:
;; (my-when-not false (println "Should print!"))
;; (my-when-not true (println "Should NOT print!"))
