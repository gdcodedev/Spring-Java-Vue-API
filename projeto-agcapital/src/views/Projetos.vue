<template>
  <div>
    <ProjetoList :clienteId="clienteId"></ProjetoList>
  </div>
</template>

<script>
import ProjetoList from '../components/ProjetoList.vue';

export default {
  components: {
    ProjetoList
  },
  data() {
    return {
      clienteId: 1 
    };
  }
};
</script>
