;; MACRO PROBLEM 5: Advanced - Create a 'with-timeout' macro
;; This macro should execute code with a timeout, returning a default value if it takes too long.
;; This is a more advanced macro that combines several concepts!
;;
;; Your macro should transform:
;;   (with-timeout 1000 "timeout!" (Thread/sleep 2000) "completed")
;; Into code that:
;;   - Runs the body in a separate thread
;;   - Waits up to 1000ms for completion
;;   - Returns "timeout!" if it takes longer
;;   - Returns "completed" if it finishes in time
;;
;; This is a real-world useful macro that shows macro power!
;; Hint: You'll need to use Java's Future, ExecutorService, or similar
;; Challenge: Handle both timeout and successful completion cases

(defmacro with-timeout [timeout-ms timeout-value & body])

;; Test your macro:
;; (with-timeout 100 "too slow!" (Thread/sleep 50) "fast enough!")  ; Should return "fast enough!"
;; (with-timeout 100 "too slow!" (Thread/sleep 200) "won't see this")  ; Should return "too slow!"