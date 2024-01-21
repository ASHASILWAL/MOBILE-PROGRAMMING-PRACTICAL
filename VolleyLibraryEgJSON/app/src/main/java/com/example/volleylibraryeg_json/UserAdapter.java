package com.example.volleylibraryeg_json;

public class UserAdapter extends ArrayAdapter <User> {

    private List<User>  userList;


    public UserAdapter(Context context , List<User> userList) {
        super(context, 0, userList);
        this.userList = userList;

        public View getView ( int position, View convertView, ViewGroup parent)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent);
        }
    }
    User user = userList.get(position);
//    ListView listView = convertView.findViewById(android.R.id.listView);
//    return super.getView(position, convertView, parent);
    TextView textView = convertView.findViewById(android.R.id.text1);
    textView.setText(user.getName());
    return convertView;

    }


