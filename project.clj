(defproject purchases-clojure "0.0.1-SNAPSHOT"
  :description "Small web app with Clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"]
                 [hiccup "1.0.5"]
                 [compojure "1.5.0"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [purchases-clojure.core]
  :main purchases-clojure.core)
