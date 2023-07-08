public class CallPlugin {
    // adds a call timer and the persons name to the call screen
    public static void addCallTimer(Context context, String name, String number) {
        Intent intent = new Intent(context, CallTimerActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("number", number);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        
    }

}
