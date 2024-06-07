<template>
  <div>
    <AtividadeList :projetoId="projetoId"></AtividadeList>
  </div>
</template>

<script>
import AtividadeList from '../components/AtividadeList.vue';

export default {
  components: {
    AtividadeList
  },
  data() {
    return {
      projetoId: 1 
    };
  }
};
</script>
