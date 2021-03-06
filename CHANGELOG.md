# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [Version 1.2.0]
### Added
- Class to output expression results to a given file.
- Class to output expression results to the command line.

### Changed
- The -o, --output option now outputs expression results to the given file.

### Removed
- The -o, --output option no longer outputs the string "Output option: \<file>".

## [Version 1.1.0]
### Added
- A class to read expressions from a text file that is instantiated with the given file when the -b \<file> CLI option is provided
- A class that uses an endless loop to accept expressions from the user that is constructed when no CLI argument is given.

### Changed
- The -b, --batch option now reads single-line expressions from the given file.

### Removed
- The -b, --batch option no longer outputs the string "Batch option: \<file>".

## [Version 1.0.0]
### Added
- -h, --help option to output the help menu
- -o, --output option that will write the expression results to the given file. Currently, it outputs the string "Output value: \<file>" where \<file> is the name of the given file
- -b, --batch option that will read several expressions from the given file and evaluate them. Currently, it outputs the string "Batch value: \<file>" where \<file> is the name of the given file.