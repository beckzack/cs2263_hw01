# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [Version 1.0.0]
- Added -h, --help CLI option to output the help menu
- Added -o, --output CLI option that will write the expression results to the given file. Currently it outputs the string "Output value: <file>" where <file> is the name of the given file
- Added -b, --batch CLI option that will read several expressions from the given file and evaluate them. Currently it outputs the string "Batch value: <file>" where <file> is the name of the given file.