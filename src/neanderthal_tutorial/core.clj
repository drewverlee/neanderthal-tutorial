(ns neanderthal-tutorial.core
  (:require [uncomplicate.neanderthal
             [native :refer :all]
             [core :refer :all]]))


(def x (dv 1 2 3))

(def y (dv 10 20 30))

(dot x y)

;; stack trace
;; 1. Unhandled java.lang.NoClassDefFoundError
;;    Could not initialize class uncomplicate.neanderthal.internal.host.CBLAS

;;                    mkl.clj:  423  uncomplicate.neanderthal.internal.host.mkl.DoubleVectorEngine/dot
;;                   core.clj:  886  uncomplicate.neanderthal.core/dot
;;                   core.clj:  875  uncomplicate.neanderthal.core/dot
;;                       REPL:   11  neanderthal-tutorial.core/eval40201
;;                       REPL:   11  neanderthal-tutorial.core/eval40201
;;              Compiler.java: 7176  clojure.lang.Compiler/eval
;;              Compiler.java: 7131  clojure.lang.Compiler/eval
;;                   core.clj: 3214  clojure.core/eval
;;                   core.clj: 3210  clojure.core/eval
;;                   main.clj:  414  clojure.main/repl/read-eval-print/fn
;;                   main.clj:  414  clojure.main/repl/read-eval-print
;;                   main.clj:  435  clojure.main/repl/fn
;;                   main.clj:  435  clojure.main/repl
;;                   main.clj:  345  clojure.main/repl
;;                RestFn.java: 1523  clojure.lang.RestFn/invoke
;;     interruptible_eval.clj:   79  nrepl.middleware.interruptible-eval/evaluate
;;     interruptible_eval.clj:   55  nrepl.middleware.interruptible-eval/evaluate
;;     interruptible_eval.clj:  142  nrepl.middleware.interruptible-eval/interruptible-eval/fn/fn
;;                   AFn.java:   22  clojure.lang.AFn/run
;;                session.clj:  171  nrepl.middleware.session/session-exec/main-loop/fn
;;                session.clj:  170  nrepl.middleware.session/session-exec/main-loop
;;                   AFn.java:   22  clojure.lang.AFn/run
;;                Thread.java:  748  java.lang.Thread/run

