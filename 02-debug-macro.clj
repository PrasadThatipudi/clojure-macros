;; MACRO PROBLEM 2: Debug macro with automatic variable names
;; Create a macro that prints both the expression and its value for debugging.
;; This is a common and very useful macro pattern!
;;
;; Your macro should transform:
;;   (debug (+ 2 3))  →  (let [result (+ 2 3)] (println "(+ 2 3) =" result) result)
;;
;; Key challenge: You need to capture the original expression AND evaluate it
;; Hint: Use `~` to unquote and evaluate, and `'~` to quote the expression
;;
;; Example usage:
;;   (debug (+ 10 20))        ; Should print: "(+ 10 20) = 30" and return 30
;;   (debug (* 6 7))          ; Should print: "(* 6 7) = 42" and return 42

(defmacro debug [expression]
  `(let [result# ~expression]
     (println '~expression "=" result#)
     result#))

(println (debug (+ 5 5)))

;; Test your macro:
;; (debug (+ 5 5))
;; (debug (str "Hello" " World"))