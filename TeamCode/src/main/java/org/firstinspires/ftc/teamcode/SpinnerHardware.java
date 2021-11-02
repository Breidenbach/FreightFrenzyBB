/*

This is the Hardware class, it is used to declare all the components and create objects
of them so they can be used in the code to run them

 */

// This just tells the code where this file is located in the file structure
package org.firstinspires.ftc.teamcode;

// This imports all the different dependencies and libraries and other classes we use in this file
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.bases.HardwareBase;

public class SpinnerHardware extends HardwareBase {
    public DcMotor spinnerMotor = null;

    HardwareMap hwMap =  null;
    private ElapsedTime period = new ElapsedTime();

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;

        spinnerMotor  = hwMap.get(DcMotor.class, "spinner_motor");

        spinnerMotor.setDirection(DcMotor.Direction.FORWARD);

        spinnerMotor.setPower(0);

        spinnerMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
 }

