#!/bin/bash
java -jar lsp-server.jar --server.port=9000 --server.address=127.0.0.1 &
P1=$!
node browser-app/src-gen/backend/main.js  /workspace --port=80 --hostname=0.0.0.0 --LSP_PORT=9000 --plugins=local-dir:browser-app/plugins &
P2=$!
wait $P1 $P2
