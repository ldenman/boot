(defproject tailrecursion/boot-classloader "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure             "1.5.1"]
                 [org.springframework/spring-core "1.2.2"]
                 [com.cemerick/pomegranate        "0.2.0" :exclusions [org.clojure/clojure]]]
  :main ^:skip-aot tailrecursion.boot-classloader
  :target-path "target" ; force target-path to maintain 2.3 compatibility
  :profiles {:uberjar {:aot :all}})
