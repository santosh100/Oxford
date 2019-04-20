/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject1;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author SANTOSH
 */
public class MySpeak {
    
     private static final String VOICENAME="kevin16";
  /**
     * @param valuetospeak***************************************************************************************/
    public static void mySpeach(String valuetospeak){                                                    
       Voice voice;
       VoiceManager vm=VoiceManager.getInstance();
       voice=vm.getVoice(VOICENAME);
      
       voice.allocate();
       try{
           voice.speak(valuetospeak);
        //    voice.speak("HELLO SANTOSH HOW ARE YOU ?");
       }catch(Exception e){
        //   System.out.println(""+e);
           
       }
    }    
}
