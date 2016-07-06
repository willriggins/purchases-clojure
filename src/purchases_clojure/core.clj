(ns purchases-clojure.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main []
  (println "Select a category: Furniture, Alcohol, Toiletries, Shoes, Food, or Jewelry")
  (let [purchases (slurp "purchases.csv")
        purchases (str/split-lines purchases)
        purchases (map (fn [line] (str/split line #","))
                    purchases)
        header (first purchases)
        purchases (rest purchases)
        purchases (map (fn [line] (zipmap header line))
                    purchases)
        input (read-line)
        purchases (filter #(= input (get % "category"))
                    purchases)
        text (pr-str purchases)]
    (spit "filtered_purchases.edn" text))) 
   
       
    
    
  
                   
   

       
      
                  
                
