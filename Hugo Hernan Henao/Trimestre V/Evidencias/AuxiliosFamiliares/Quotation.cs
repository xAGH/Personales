using System;
using System.Globalization;
using System.Windows.Forms;

namespace AuxiliosFamiliares
{
    public partial class QuotationWindow : Form
    {

        public QuotationWindow()
        {
            InitializeComponent();
        }

        private void CheckBoxGreeting_CheckedChanged(object sender, EventArgs e)
        {
            groupBoxGender.Visible = checkBoxGreeting.Checked;
        }

        private void TextBox_TextChanged(object sender, EventArgs e)
        {

            if (textBoxName.Text.Length > 0 && textBoxSalary.Text.Length > 0) buttonCalculate.Enabled = true;

            else buttonCalculate.Enabled = false;
        }

        private void ButtonExit_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void ButtonNew_Click(object sender, EventArgs e)
        {
            textBoxName.Clear();
            textBoxSalary.Clear();
            numericUpDownSons.Value = 0;
            checkBoxSyndicateMember.Checked = false;
            checkBoxGreeting.Checked = false;
            radioButtonFemenine.Checked = false;
            radioButtonMasculine.Checked = false;
            radioButtonTrans.Checked = false;
            labelResult.Text = "";
        }

        private void TextBoxSalary_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != '.'))
            {
                e.Handled = true;
            }
        }
    }
}
