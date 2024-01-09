//imported necessary libraries for Unity  
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

//Class holding variables that control speed and direction for a moving object
//MoveNinja is the name of the object this script is attributed to 
public class MoveNinja : MonoBehaviour
{
    
    //speed of movement
    public float speed = .1f;
    //Update is called once per frame 
    void Update()
    {
        //input for horizontal movement
        float xDirection = Input.GetAxis("Horizontal");
        //input for vertical movement (forward/backward)
        float zDirection = Input.GetAxis("Vertical"); 
        //creates a vector representing movement direction based on input
        Vector3 moveDirection = new Vector3(xDirection, 0f, zDirection);
        transform.position += moveDirection;

    }
}
