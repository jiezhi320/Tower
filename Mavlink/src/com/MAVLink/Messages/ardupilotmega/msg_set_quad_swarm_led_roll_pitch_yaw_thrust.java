// MESSAGE SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST PACKING
package com.MAVLink.Messages.ardupilotmega;

import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkPayload;
//import android.util.Log;

/**
* Setpoint for up to four quadrotors in a group / wing
*/
public class msg_set_quad_swarm_led_roll_pitch_yaw_thrust extends MAVLinkMessage{

	public static final int MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST = 63;
	public static final int MAVLINK_MSG_LENGTH = 46;
	private static final long serialVersionUID = MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST;
	

 	/**
	* Desired roll angle in radians +-PI (+-32767)
	*/
	public short roll[] = new short[4]; 
 	/**
	* Desired pitch angle in radians +-PI (+-32767)
	*/
	public short pitch[] = new short[4]; 
 	/**
	* Desired yaw angle in radians, scaled to int16 +-PI (+-32767)
	*/
	public short yaw[] = new short[4]; 
 	/**
	* Collective thrust, scaled to uint16 (0..65535)
	*/
	public short thrust[] = new short[4]; 
 	/**
	* ID of the quadrotor group (0 - 255, up to 256 groups supported)
	*/
	public byte group; 
 	/**
	* ID of the flight mode (0 - 255, up to 256 modes supported)
	*/
	public byte mode; 
 	/**
	* RGB red channel (0-255)
	*/
	public byte led_red[] = new byte[4]; 
 	/**
	* RGB green channel (0-255)
	*/
	public byte led_blue[] = new byte[4]; 
 	/**
	* RGB blue channel (0-255)
	*/
	public byte led_green[] = new byte[4]; 

	/**
	 * Generates the payload for a mavlink message for a message of this type
	 * @return
	 */
	public MAVLinkPacket pack(){
		MAVLinkPacket packet = new MAVLinkPacket();
		packet.len = MAVLINK_MSG_LENGTH;
		packet.sysid = 255;
		packet.compid = 190;
		packet.msgid = MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST;
		 for (int i = 0; i < roll.length; i++) {
                        packet.payload.putShort(roll[i]);
            }
		 for (int i = 0; i < pitch.length; i++) {
                        packet.payload.putShort(pitch[i]);
            }
		 for (int i = 0; i < yaw.length; i++) {
                        packet.payload.putShort(yaw[i]);
            }
		 for (int i = 0; i < thrust.length; i++) {
                        packet.payload.putShort(thrust[i]);
            }
		packet.payload.putByte(group);
		packet.payload.putByte(mode);
		 for (int i = 0; i < led_red.length; i++) {
                        packet.payload.putByte(led_red[i]);
            }
		 for (int i = 0; i < led_blue.length; i++) {
                        packet.payload.putByte(led_blue[i]);
            }
		 for (int i = 0; i < led_green.length; i++) {
                        packet.payload.putByte(led_green[i]);
            }
		return packet;		
	}

    /**
     * Decode a set_quad_swarm_led_roll_pitch_yaw_thrust message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
	     for (int i = 0; i < roll.length; i++) {
			roll[i] = payload.getShort();
		}
	     for (int i = 0; i < pitch.length; i++) {
			pitch[i] = payload.getShort();
		}
	     for (int i = 0; i < yaw.length; i++) {
			yaw[i] = payload.getShort();
		}
	     for (int i = 0; i < thrust.length; i++) {
			thrust[i] = payload.getShort();
		}
	    group = payload.getByte();
	    mode = payload.getByte();
	     for (int i = 0; i < led_red.length; i++) {
			led_red[i] = payload.getByte();
		}
	     for (int i = 0; i < led_blue.length; i++) {
			led_blue[i] = payload.getByte();
		}
	     for (int i = 0; i < led_green.length; i++) {
			led_green[i] = payload.getByte();
		}    
    }

     /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_set_quad_swarm_led_roll_pitch_yaw_thrust(){
    	msgid = MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     * 
     */
    public msg_set_quad_swarm_led_roll_pitch_yaw_thrust(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST;
        unpack(mavLinkPacket.payload);
        //Log.d("MAVLink", "SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST");
        //Log.d("MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST", toString());
    }
    
                  
    /**
     * Returns a string with the MSG name and data
     */
    public String toString(){
    	return "MAVLINK_MSG_ID_SET_QUAD_SWARM_LED_ROLL_PITCH_YAW_THRUST -"+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" thrust:"+thrust+" group:"+group+" mode:"+mode+" led_red:"+led_red+" led_blue:"+led_blue+" led_green:"+led_green+"";
    }
}
