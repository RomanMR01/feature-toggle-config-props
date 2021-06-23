# Feature toggle with configuration properties
Application demonstrates using feature toggle with configuration properties.

### Local startup
Before execution, MySQL server should be running on port 3306 (with default username/password is root/root).
After that, to start app, execute:
```
 mvn spring-boot:run
```
And open http://localhost:8080/
Product with rating (in case when toggle enable): http://localhost:8080/products/1

To change toggle state open file 'toogle.properties' and update value of 'stars.rating.enabled'
from 'false' to 'true' or vice versa.
