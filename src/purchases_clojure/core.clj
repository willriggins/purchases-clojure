(ns purchases-clojure.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main []
  (let [purchases (slurp "purchases.csv")
        purchases (str/split-lines purchases)
        purchases (map (fn [line] (str/split line #","))
                    purchases)
        header (first purchases)
        purchases (rest purchases)
        purchases (map (fn [line] (zipmap header line))
                    purchases)]    
    purchases))
    
   
       
    
    
  
                   
   

       
      
                  
                
