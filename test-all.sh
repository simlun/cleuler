#/bin/bash
for d in euler???; do (echo "Testing $d..." && cd $d && lein midje); done
