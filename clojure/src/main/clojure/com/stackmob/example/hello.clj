(comment
 Copyright 2012 StackMob

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 )

(ns com.stackmob.example.hello
  (:gen-class
   :name com.stackmob.example.HelloWorld
   :implements [com.stackmob.core.customcode.CustomCodeMethod]
   :main false))

(import java.util.HashMap)
(import com.stackmob.core.rest.ResponseToProcess)

(defn -getMethodName [this]
  "hello_world")

(defn -getParams [this]
  nil)

(defn -execute [this request provider]
  (ResponseToProcess. 200 (doto (HashMap.) (.put "text" "Hello, world!"))))
