package pl.edu.pw.eiti.wsd.bar_finder.bar_controller_agent.loudness_controller_agent.behaviours;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import pl.edu.pw.eiti.wsd.bar_finder.bar_controller_agent.loudness_controller_agent.LoudnessControllerAgent;

public class ProvideLoudnessLevel extends CyclicBehaviour {
    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();
        ACLMessage reply;
        if (msg != null) {
            reply = msg.createReply();
            if(msg.getPerformative() == ACLMessage.QUERY_REF){
                reply.setPerformative(ACLMessage.INFORM);
                reply.setContent(getAgent().checkLoudnessLevel());
            } else {
                reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
            }
            myAgent.send(reply);
        } else {
            block();
        }
    }

    public LoudnessControllerAgent getAgent(){
        return (LoudnessControllerAgent)myAgent;
    }
}