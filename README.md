# Log-Generator Application :zap:

## Description
The purpose of log-generator is to generate high volume of log messages of specific format.
Sample log message has following format:
```
46.174.243.93 - - [29/Mar/2016:00:01:15 +0200] "GET /uploads/posts/2012-03/thumbs/1332499960_11.jpg HTTP/1.1" 200 12531 "http://myppc.ru/literature/page/12/" "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.111 YaBrowser/16.2.0.3539 Safari/537.36"
```

Above log statement contains following parts:
- ip
- datetime
- page path
- status code
- page size
- referrer
- user-agent

Each of the above parts could be configured via implementing *Generator* interface.
