#!/bin/bash
mvn clean test
./checksum.sh
# Add change to file.
git am 0001-Changed-only-the-signature-of-the-method.patch
git diff HEAD~1
mvn test
./checksum.sh
# Undo the above patch 
git reset HEAD~1
git co -- .
