package frc.robot;

public class Swerve {
    private int driveID;
    private int turnID;
    private int encoderID;
    private float encoderOffset;
    private String moduleName;

    public void __init__(int pDriveID, int pTurnID, int pEncoderID, float pEncoderOffset, String pModuleName) {
        driveID = pdriveID;
        turnID = pTurnID;
        encoderID = pEncoderID;
        encoderOffset = pEncoderOffset;
        moduleName = pModuleName;
    }
}
