## StackMob Custom Code Example Projects

This example project is a simple Hello World.  This adds a server-side method called "hello_world" which can be called from your client iOS, Android, or JS SDKs.  In fact, your method will be available as a REST API at:

    http://api.mob1.stackmob.com/hello_world
    
Custom code allows you to even define the returned JSON.  In this case, our simple Hello World example will return:

    { "msg": "Hello, world!" }
    
You can call your server-side custom code from your SDK.  The request will be sent from the client, StackMob will route the call to the appropriate code and execute the code you've written, then StackMob will return the JSON you've defined.

<span class="tab callcc" title="iOS SDK"/>
<span class="tab"/>

<span class="tab callcc" title="Android SDK"/>
<span class="tab"/>

<span class="tab callcc" title="JS SDK"/>
**JS SDK**

```javascript
<script type="text/javascript">
  StackMob.customcode('hello_world', {}, {
     success: function(jsonResult) {
       console.debug(jsonResult); //prints "Hello, world!"
     },
     
     error: function(failure) {
       //doh!
     }
  });
</script>
```
<span class="tab"/>

### Java (Maven)

Building:

1. cd java
2. mvn clean package
3. JAR is located in java/target
4. [upload JAR to StackMob](https://www.stackmob.com/platform/api/customcode/upload)

### Scala (Maven)

Building:

1. cd scala-maven
2. mvn clean package
3. JAR is located in scala/target
4. [upload JAR to StackMob](https://www.stackmob.com/platform/api/customcode/upload)

### Scala (sbt)

Building:

1. cd scala-sbt
2. sbt clean package
3. JAR is located in scala/target/scala-2.9.1
4. [upload JAR to StackMob](https://www.stackmob.com/platform/api/customcode/upload)

### Clojure (Maven)

Building:

1. cd clojure
2. mvn clean package
3. JAR is located in clojure/target
4. upload JAR to [StackMob](https://www.stackmob.com/platform/api/customcode/upload)
