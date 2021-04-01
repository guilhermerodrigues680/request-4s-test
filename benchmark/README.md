```sh
# JVM

$ ab -n 10000 -c 100 http://ip172-18-0-88-c1isl59bqvp000a5lmig-8081.direct.labs.play-with-docker.com/task?id=1
This is ApacheBench, Version 2.3 <$Revision: 1879490 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking ip172-18-0-88-c1isl59bqvp000a5lmig-8081.direct.labs.play-with-docker.com (be patient)
Completed 1000 requests
Completed 2000 requests
Completed 3000 requests
Completed 4000 requests
Completed 5000 requests
Completed 6000 requests
Completed 7000 requests
Completed 8000 requests
Completed 9000 requests
Completed 10000 requests
Finished 10000 requests


Server Software:        
Server Hostname:        ip172-18-0-88-c1isl59bqvp000a5lmig-8081.direct.labs.play-with-docker.com
Server Port:            80

Document Path:          /task?id=1
Document Length:        32 bytes

Concurrency Level:      100
Time taken for tests:   595.141 seconds
Complete requests:      10000
Failed requests:        281
   (Connect: 0, Receive: 0, Length: 281, Exceptions: 0)
Total transferred:      1185718 bytes
HTML transferred:       311008 bytes
Requests per second:    16.80 [#/sec] (mean)
Time per request:       5951.405 [ms] (mean)
Time per request:       59.514 [ms] (mean, across all concurrent requests)
Transfer rate:          1.95 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        1   84 383.1      1    7009
Processing:  4006 5811 5364.2   4017   30438
Waiting:        0 4965 3530.9   4016   23826
Total:       4007 5895 5436.2   4019   37016

Percentage of the requests served within a certain time (ms)
  50%   4019
  66%   4031
  75%   4056
  80%   4444
  90%   9900
  95%  19773
  98%  30020
  99%  30123
 100%  37016 (longest request)
```

```sh
# JAVA NATIVO

$ ab -n 10000 -c 100 http://ip172-18-0-88-c1isl59bqvp000a5lmig-8082.direct.labs.play-with-docker.com/task?id=1
This is ApacheBench, Version 2.3 <$Revision: 1879490 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking ip172-18-0-88-c1isl59bqvp000a5lmig-8082.direct.labs.play-with-docker.com (be patient)
Completed 1000 requests
Completed 2000 requests
Completed 3000 requests
Completed 4000 requests
Completed 5000 requests
Completed 6000 requests
Completed 7000 requests
Completed 8000 requests
Completed 9000 requests
Completed 10000 requests
Finished 10000 requests


Server Software:        
Server Hostname:        ip172-18-0-88-c1isl59bqvp000a5lmig-8082.direct.labs.play-with-docker.com
Server Port:            80

Document Path:          /task?id=1
Document Length:        32 bytes

Concurrency Level:      100
Time taken for tests:   591.770 seconds
Complete requests:      10000
Failed requests:        256
   (Connect: 0, Receive: 0, Length: 256, Exceptions: 0)
Total transferred:      1188768 bytes
HTML transferred:       311808 bytes
Requests per second:    16.90 [#/sec] (mean)
Time per request:       5917.701 [ms] (mean)
Time per request:       59.177 [ms] (mean, across all concurrent requests)
Transfer rate:          1.96 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        1   58 274.3      1    7008
Processing:  4005 5802 5299.1   4016   30867
Waiting:        0 5032 3641.5   4015   23868
Total:       4007 5860 5355.6   4018   37014

Percentage of the requests served within a certain time (ms)
  50%   4018
  66%   4029
  75%   4052
  80%   4311
  90%   9868
  95%  19489
  98%  30012
  99%  30100
 100%  37014 (longest request)
```
