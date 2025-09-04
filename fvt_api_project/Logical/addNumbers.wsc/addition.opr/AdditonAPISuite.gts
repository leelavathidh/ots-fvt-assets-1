<?xml version="1.0" encoding="UTF-8"?>
<editableResource createdTimestamp="1729966073515"
    createdUser="anshul.kulkarni" id="743a0e6a:192c9ffb367:-7d2a"
    type="test_suite_resource" updatedTimestamp="1729966197796"
    updatedUser="anshul.kulkarni" version="1.0">
    <loggingConfiguration debug="false" resultWriterLoggingLevel="FULL" writeStubEventsToDB="true"/>
    <resourceConfig>
        <scenario continueOnFail="true" id="743a0e6a:192c9ffb367:-7d29"
            type="scenario" version="1.0">
            <loggingConfiguration debug="false"
                resultWriterLoggingLevel="FULL" writeStubEventsToDB="false"/>
            <resourceConfig chkenv="false" name="Scenario"
                pacingtime="0.0" pacingtype="MIN_DURATION"
                parallel="false" slowfail="false" usepacing="false">
                <environmentTasks preventExecutionOnFailure="false"/>
            </resourceConfig>
            <testItem continueOnFail="true"
                id="642ffe99:192c9006b9c:-75af" lkname="AdditionAPITest"
                lkpath="addNumbers/addition/AdditionAPITest" type="test_resource"/>
            <testItem continueOnFail="true"
                id="743a0e6a:192c9ffb367:-7cf5" lkname="SumAPITest"
                lkpath="addNumbers/addition/SumAPITest" type="test_resource"/>
        </scenario>
    </resourceConfig>
</editableResource>
