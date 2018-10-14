# SnappetTest
Tests for Snappet

You can run the tests using IntelliJ IDEA or maven.

In order to run the tests you can use maven using the command:
>        $ mvn verify 
it will run the tests using Google Chrome.
You can also run the tests in Firefox and PhantomJS, using the following commands:
>        $ mvn verify -Dcontext=firefox -Dwebdriver.driver=firefox
>        $ mvn verify -Dcontext=phantomjs -Dwebdriver.driver=phantomjs
        
You can find the aggregated report in /Report.lnk  
