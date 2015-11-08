#!/bin/bash 

curl https://api.orchestrate.io/v0/Ap/key \
-X PUT \
-H 'Content-Type:application/json' \
-u 'e47bd7ea-e5a1-4b17-b81f-87dae65b1619:' \
-d '{"name": "Kate Robbins", "hometown": "Portland, OR", "twitter": "@katesfaketwitter"}'