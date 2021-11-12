#This Program will create a ring topology using less number of statements in TCL Language
set ns [new Simulator]
#$ns rtproto DV
$ns color 1 blue
$ns color 2 red

set nf [open ring.nam w]
$ns namtrace-all $nf

proc finish {} {
        global ns nf
        $ns flush-trace
        close $nf
        exec nam ring.nam
        exit 0
        }

set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]
set n5 [$ns node]

$ns duplex-link $n0 $n1 10Mb 10ms DropTail
$ns duplex-link $n1 $n2 10Mb 10ms DropTail
$ns duplex-link $n2 $n3 10Mb 10ms DropTail
$ns duplex-link $n3 $n4 10Mb 10ms DropTail
$ns duplex-link $n4 $n5 10Mb 10ms DropTail
$ns duplex-link $n5 $n0 10Mb 10ms DropTail




$ns duplex-link-op $n0 $n1 orient right-up
$ns duplex-link-op $n1 $n2 orient right
$ns duplex-link-op $n2 $n3 orient right-down
$ns duplex-link-op $n3 $n4 orient left-down
$ns duplex-link-op $n4 $n5 orient left
$ns duplex-link-op $n5 $n0 orient left-up


$ns at 1.0 "finish"

$ns run
