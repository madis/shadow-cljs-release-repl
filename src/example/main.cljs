(ns example.main
  (:require [shadow.cljs.devtools.api :as shadow]))

(enable-console-print!)

(defn -main []
  (println "Starting REPL server...")
  (shadow/node-repl :node)
  (println "REPL server started. Run 'shadow-cljs cljs-repl node' in another terminal to connect.")
  ;; Your main application logic here
  )

(set! *main-cli-fn* -main)
